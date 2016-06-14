// Databricks notebook source exported at Tue, 14 Jun 2016 21:48:56 UTC
// MAGIC %sql use maddiedev

// COMMAND ----------

dbutils.widgets.dropdown("Hockey Teams", "sharks", Seq("sharks", "bruins", "canucks", "all"));

// COMMAND ----------

val team1 = dbutils.widgets.get("Hockey Teams");

if (team1 == "all") {
  val total_goals = sqlContext.sql("select game as team, count(*) as total_goals from games group by game");
  display(total_goals);
}
else {
  val total_goals = sqlContext.sql("select game as team, count(*) as total_goals from games where game='"+team1+"' group by game");
  display(total_goals);
}


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

