// Databricks notebook source exported at Sat, 18 Jun 2016 06:00:19 UTC
// MAGIC %md 
// MAGIC Testing Scala Notebook integration with github

// COMMAND ----------

val AccessKey = "REPLACE_WITH_YOUR_ACCESS_KEY"
val SecretKey = "REPLACE_WITH_YOUR_SECRET_KEY"
val EncodedSecretKey = SecretKey.replace("/", "%2F")
val AwsBucketName = "REPLACE_WITH_YOUR_S3_BUCKET"
val MountName = "REPLACE_WITH_YOUR_MOUNT_NAME"

// COMMAND ----------

