// Databricks notebook source exported at Mon, 17 Oct 2016 23:14:17 UTC
// import required spark classes
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf

// define main method (scala entry point)
object HelloWorld {
  def main(args: Array[String]) {

    // initialise spark context
    val conf = new SparkConf().setAppName("HelloWorld")
    val sc = new SparkContext(conf)
    
    // do stuff
    println("Hello, world!")
    
    // terminate spark context
    sc.stop()
    
  }
}

// COMMAND ----------

dbutils.widgets.help()

// COMMAND ----------

