# Mise en place d'un client qui interroge un service web

Ce client contact un web service SOAP ensuite le Ws SOAP contact un Ws Rest qui va faire des actions et qui va renvoyer les informations au client en repassant par le ws SOAP et qui va etre renvoyé au client SOAP

![Shemas](imageReadMe/logo.png)

#Prérequis

Version de java : 1.8 
Tomacat en java 1.8 sur le port 8080

#Lancement de l'application

1. installer le "restfulexample.war" dans votre tomcat en java 1.8 sur le port 8080
2. verifier que le server est lancé sur ce lien : http://localhost:8080/restfulexample/rest/json/metallica/get
   Le resultat de ce lien : 
   ![Shemas](imageReadMe/ResultatWar.png)
3. Rendrez-vous dans le dossier livraison a partir d'un invité de commande
4. lancer la commande suivante : "java -jar SoapWs-1.0-SNAPSHOT-jar-with-dependencies.jar"
  Le resultat de cette commande :![Shemas](imageReadMe/wsSOAP.png)
5. Relancer un terminal et rendez-vous dans le dossier livraison 
6. lancer la commande suivante : "java -jar wsSoapRest.jar"
   Le resultat de cette commande :![Shemas](imageReadMe/ClientSOAP.png)
