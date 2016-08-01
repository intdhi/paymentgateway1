# paymentgateway1
paymentgateway

spring mybatis 
info 
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

[QUOTE=DiamondBond][QUOTE=yudhint]Hi DiamondBond, 
I follow your instructions for build CM12.1 [URL="http://forum.xda-developers.com/moto-g-2014/general/guide-build-cm12-source-t3045014"]this[/URL]
but when I follow for third step ( Grabbing build dependencies) I got some error because your repo from git [url]https://github.com/DiamondBond/Scripts/[/url] not found 

what can I do next?
Bg
thanks[/QUOTE]
my scripts repo is dead, your gonna have to find the build scripts from luca's repo's + cm13 is out, use cm13 sources and im sure there are new device specific blobs aswell, so your gonna have to find those aswell.[/QUOTE]

