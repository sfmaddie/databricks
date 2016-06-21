// Databricks notebook source exported at Tue, 21 Jun 2016 23:37:19 UTC
// MAGIC %sql use maddiedev

// COMMAND ----------

// MAGIC %md
// MAGIC Adding Title

// COMMAND ----------

dbutils.widgets.dropdown("Hockey Teams", "sharks", Seq("sharks", "bruins", "canucks", "all"));

// COMMAND ----------

ksdfghmsdfnbmxcvbnkxvc.bj,r

// COMMAND ----------

val team2 = dbutils.widgets.get("Hockey Teams");

if(team2 == "all") {
  val avg_goals = sqlContext.sql("select game as team, round(avg(goals)) as avg_goals from games group by game order by avg_goals desc");
  display(avg_goals);
}
else {
  val avg_goals = sqlContext.sql("select game as team, round(avg(goals)) as avg_goals from games where game='"+team2+"' group by game order by avg_goals desc");
  display(avg_goals);
}

// COMMAND ----------

