# TEST: Team Composer App

In una azienda manifatturiera si è deciso di realizzare un software che
consenta di definire le squadre operative e di aggiungere al loro interno
i nominativi dei suoi componenti.

Il CEO richiede che l'interfaccia sia semplice e possa compiere più di 
un'operazione interpretando il comando inviato.

Sono previsti i seguenti comandi

- CREATE
- DISPLAY

Entrambe queste funzioni possono essere declinate secondo diverse esigenze.

- **CREATE TEAM** [nomeSquadra] crea una nuova squadra assegnandole l'identificativo in formato stringa
- **CREATE PERSON** [nomeSquadra] [nomeDipendente] : crea una persona assegnadola ad una squadra esistente. Se non esiste nessuna squadra con l'identificativo specificato, deve essere lanciata una eccezione
- **DISPLAY TEAM** [nomeSquadra] stampa a console l'elenco delle persone assegnate alla squadra specificata
- **DISPLAY PERSON** [nomeDipendente] : stampa a console il nome del dipendente e a che squadra appartiene
- **DISPLAY FULL** Stampa un elenco ordinato in ordine alfabetico di tutte le squadre indicando nome squadra ed elenco dei suoi componenti, a loro volta ordinati alfabeticamente.


### Vincoli
- Non possono esistere due squadre con lo stesso nome: se viene richiesto un nome già usato va lanciato un errore
- Possono esistere persone con lo stesso nome, a patto che appartengano a squadre diverse
- Una squadra può chiamarsi come un dipedente e viceversa

### Obiettivi

- Implementare l'interfaccia TeamManagement secondo le specifiche indicate
- Implementare gli unit test dei componenti usati per realizzare l'applicativo

### Bonus
Vengono considerati punti di merito aggiuntivi le seguenti caratteristiche
- Utilizzo appropriato di Design Pattern
- Rispetto dei principi SOLID
- Aggiunta di funzionalità extra
