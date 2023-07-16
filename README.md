# choco_commerce
Esercitazione in vista dell'esame finale per il diploma di FinTech Software Developer erogato da ITS ICT Piemonte

## Requisiti

Si vuole realizzare un sito per la commercializzazione di diversi tipi di cioccolato. 
Ciascun utente registrato nel sistema può:

 - creare un nuovo ordine, selezionanto i prodotti
 - visualizzare lo stato degli ordini già effettuati (in lavorazione, spedito, consegnato, annullato)
 - annullare un ordine se è nello stato “in lavorazione”.

Si supponga che il sistema informativo si basi su un database “cioccolatodb” così organizzato:

```
utente( idUtente, password, nomeUtente )
prodotto( codiceBarre, nome, prezzo, idtipo )
ordine( idOrdine, idUtente, timestamp, totale, stato)
ordineprodotto(idOrdine, codiceBarre, quantità)
tipo(idtipo, nomeTipo)
```

Si vuole realizzare in tecnologia Java Web una porzione del sito, che comprenda le seguenti funzionalità:

1. Una pagina Gestione Ordini che, nel caso l'utente abbia effettuato correttamente il login, presenta all'utente l'elenco degli ordini effettuati (dal più recente al più vecchio), visualizzando il rispettivo stato.
   Per ciascun ordine, l'utente deve poter:
   - visualizzare i dettagli dell'ordine stesso in una pagina separata;
   - annullare l'ordine, solamente se esso è in stato “in lavorazione”.
   
   In calce alla pagina, ci sarà un link che porta alla creazione di un nuovo ordine.

2. Una pagina Nuovo Ordine che visualizzi tutti i prodotti disponibili, raggruppati per tipo ed ordinati all'interno di ciascun gruppo per prezzo ascendente.
   Deve essere possibile scegliere per ogni prodotto la quantità da ordinare.

   Non è richiesto di realizzare la funzionalità di inserimento dell'ordine nel database (alla pressione del bottone “concludi ordine” si andrà in un pagina doInserisciOrdine, da non implementare).

In particolare, si richiede di:

- identificare, a partire dalle specifiche precedenti, le componenti necessarie (pagine jsp, servlet, bean, ...) a realizzare le funzionalità sopra descritte secondo il paradigma MVC
- implementare tali pagine e classi.
