# Tesi

eseguire gli script nel seguente ordine:
1. build_project.sh 
2. build_images.sh
3. run_all_container.sh
A questo punto entrambi i container dovrebbero essere attivi e l'applicazione in esecuzione. Verificare il funzionamento del server all'url localhost:8081/restaurants 
(se carica la pagina con un errore è tutto ok poichè non ci sono ristoranti nel db, mentre se da sito irraggiungibile qualcosa è andato storto).

Per interrompere l'esecuzione eseguire stop_all_containers.sh
Se eventualemente si vogliono cancellare i container creati eseguire delete_all_container.sh
