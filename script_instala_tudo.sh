#!/bin/bash
sudo apt update
sudo apt upgrade
sudo apt install nano
sudo apt-get install software-properties-common
sudo add-apt-repository ppa:webupd8team/java -y
sudo apt update
sudo apt install oracle-java8-installer
sudo apt install oracle-java8-set-default
cd /opt
wget http://www-eu.apache.org/dist/maven/maven-3/3.6.0/binaries/apache-maven-3.6.0-bin.tar.gz
sudo tar -xf apache-maven-3.6.0-bin.tar.gz
sudo mv apache-maven-3.6.0/ apache-maven/
sudo update-alternatives --install /usr/bin/mvn maven /opt/apache-maven/bin/mvn 1001
cd /etc/profile.d/
touch maven.sh
echo "# Apache Maven Environment Variables" >> maven.sh
echo "# MAVEN_HOME for Maven 1 - M2_HOME for Maven 2" >> maven.sh
echo "export JAVA_HOME=/usr/lib/jvm/java-8-oracle" >> maven.sh
echo "export M2_HOME=/opt/apache-maven" >> maven.sh
echo "export MAVEN_HOME=/opt/apache-maven" >> maven.sh
echo "export PATH=${M2_HOME}/bin:${PATH}" >> maven.sh
sudo chmod +x maven.sh
source maven.sh
cd /home
sudo apt install mysql-server
mysql -u root -pPASSWORD123 <<EOF  /* nesta aqui e teixeira*/
create database restaurantes_database;
create user 'joao'@'localhost' identified by 'joao_pass';
GRANT ALL ON restaurantes_database.* TO 'joao'@'localhost';
FLUSH PRIVILEGES;
EOF
sudo apt install git



