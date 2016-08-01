# paymentgateway1
paymentgateway

spring mybatis 

info :
project build : maven project
project name : paymentgateway1
db : postgresql (config : resources/database.properties)
or using mysql database but add mysql library in pom.xml

template : bootstrap sbadmin2
spring version : 4.1.6.RELEASE
mybatis version : 3.3.0
java version : min jdk7
tomcat version : tomcat 7

Login app : 
username = aa
password = aa

use this query in your database

CREATE TABLE merchants
(
  id serial primary key,
  merchant_name character varying(50) NOT NULL,
  terminal_name character varying(50) NOT NULL,
  merchant_type character varying(50) NOT NULL,
  registered_date_time date DEFAULT now(),
  activate_date_time date NOT NULL
)
