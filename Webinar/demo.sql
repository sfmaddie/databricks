-- Databricks notebook source
select count(*), state from emp where salary > 250000 group by state

-- COMMAND ----------

select * from emp

-- COMMAND ----------

-- MAGIC %scala 
-- MAGIC val taxes2013 = sqlContext
-- MAGIC   .read.format("com.databricks.spark.csv")
-- MAGIC   .option("header", "true")
-- MAGIC   .load("dbfs:/databricks-datasets/data.gov/irs_zip_code_data/data-001/2013_soi_zipcode_agi.csv");
-- MAGIC 
-- MAGIC taxes2013.createOrReplaceTempView("taxes2013")

-- COMMAND ----------

-- MAGIC %scala val markets = sqlContext
-- MAGIC   .read.format("com.databricks.spark.csv")
-- MAGIC   .option("header", "true")
-- MAGIC   .load("dbfs:/databricks-datasets/data.gov/farmers_markets_geographic_data/data-001/market_data.csv");
-- MAGIC markets.createOrReplaceTempView("markets")

-- COMMAND ----------

DROP TABLE IF EXISTS cleaned_taxes;

CREATE TABLE cleaned_taxes AS
SELECT state, int(zipcode / 10) as zipcode, 
  int(mars1) as single_returns, 
  int(mars2) as joint_returns, 
  int(numdep) as numdep, 
  double(A02650) as total_income_amount,
  double(A00300) as taxable_interest_amount,
  double(a01000) as net_capital_gains,
  double(a00900) as biz_net_income
FROM taxes2013

-- COMMAND ----------

select * from cleaned_taxes