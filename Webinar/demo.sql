-- Databricks notebook source
select count(*), state from emp where salary > 290000 group by state

-- COMMAND ----------

