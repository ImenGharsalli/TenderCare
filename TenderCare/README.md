TenderCare-backend
Description:

A java backend for https://github.com/ImenGharsalli/TenderCare. This is a Spring boot project written in java8 with Apache Cassandra as database, Spring data Cassandra for the data access layer and a RESTful service layer.
Prerequisites:

Java 8 installation:
$sudo add-apt-repository ppa:webupd8team/java
$sudo apt-get update
$sudo apt-get install oracle-java8-installer

Apache Cassandra installation:
Download & Unzip folder.

Apache Cassandra Configuration:
-Cassandra writes its logs in /var/log/cassandra/
-Make sure sure these directories exist and can be written on.
For 2.1-: Change the line in cassandra folder in conf/log4j-server.properties :
log4j.appender.R.File = /var/log/cassandra/system.log
For 2.1*: Change the line in your cassandra folder in conf/logback.xml :
/var/log/cassandra/system.log

Start cassandra : $bin/cassandra -f
In background : $bin/cassandra
With ctrl c it keeps running in back ground. Kill it to stop the process : $pkill -f CassandraDaemon
cqlsh = interactive command line interface for C* : starts with $bin/cqlsh 
