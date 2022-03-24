# TPSockets
- Ce TP est pour objectif d'implémenter une petite application Client Serveur en utilisant l'interface Socket tout en se basant sur le mode connecté,
autrement dit le protocole réseau TCP/IP. La socket s'agit d'une canal qui nous permettre en fait d'établir la communication le client et le serveur.
- Ce travail est s'inspirer de la vidéo numéro 2 et 3 du playlist intitulé la programmation réseaux.

# 1/ Classe ServerA:
Voici l'ensemble d'instruction du code utilisé pour établir la classe serveur:
- Premièrement j'ai créer une ServerSocket et lui associé un numéro du Port (1234)
- après j'attend jusqu'a la connexion est établie
- je récupére le nombre envoyé par le client
- je fait le calcul et j'envoi le résultat au client

![server](https://user-images.githubusercontent.com/102219821/160011567-7f72e7f2-3518-46cb-a2d7-632675316edf.png)

# 2/ Classe ClientA:
Voici l'ensemble d'instruction du code utilisé pour établir la classe client:
- Premièrement j'ai créer une ServerSocket et lui associé l'adresse ip du client et le numéro du Port du serveur (1234)
- j'implément les deux instructions bloquant (lecture et ecriture)
- j'envoi un nombre au serveur
- je récupere le résultat et je l'afficher
      
   ![client](https://user-images.githubusercontent.com/102219821/160012655-7e13f48b-8305-42f5-a639-021d71f47944.png)
   
# 3/ Exécution: 
- Lancement du serveur: ****************************************************************

![Démarrage du serveur](https://user-images.githubusercontent.com/102219821/160014107-c11c94b4-265a-4174-a4c9-e71b280298f8.png)



- Lancement du client: ****************************************************************

![Démarrage du clientr](https://user-images.githubusercontent.com/102219821/160014130-c27f7b40-60f7-4288-9056-796bc79429d6.png)



- Le client envoi un nombre au serveur et recevoir par la suite le résultat

![envoyer nombre au server et recevoir le résultat](https://user-images.githubusercontent.com/102219821/160013388-8c9fb281-b615-4aa9-951f-49e728529703.png)


- Le serveur recoit le nombre envoyé par le client et fait le calcul et après renvoie le résultat au client 

![serveur recoit le nombre fait le calcul et renvoie le résultat](https://user-images.githubusercontent.com/102219821/160013670-4296b6f1-3bce-4225-bee8-127446fd0459.png)
