# e-commerce-distributed

## Firestore databse structure

The project uses the Firestore database to store users' and offices' information. 

Firestore uses collections to store documents that contain data as a set of key-value pairs. To differentiate between them, the next symbology is used:

<img src="https://cdn.onlinewebfonts.com/svg/img_3438.png" width="17px"> Collections


<img src="https://listimg.pinclipart.com/picdir/s/170-1705038_orange-text-file-4-icon-document-icon-png.png" width="14px"> Documents

`key: "val"` Data

### Firestone database: offices

There are a total of 3 offices, each representing a city and having the city name as the office name. The offices are divided by rooms with their respective names. Each room has seats, and each seat has a name and setup information to identify whether the seat has a desktop or is available for a laptop.

<img src="https://cdn.onlinewebfonts.com/svg/img_3438.png" width="17px"> offices

  <img src="https://listimg.pinclipart.com/picdir/s/170-1705038_orange-text-file-4-icon-document-icon-png.png" width="14px"> guayaquil
  
  `officeName: "guayaquil"`

    <img src="https://cdn.onlinewebfonts.com/svg/img_3438.png" width="17px"> rooms
  
      <img src="https://listimg.pinclipart.com/picdir/s/170-1705038_orange-text-file-4-icon-document-icon-png.png" width="15px"> room1
  
      `name: "room1"`

        <img src="https://cdn.onlinewebfonts.com/svg/img_3438.png" width="17px"> seats

          <img src="https://listimg.pinclipart.com/picdir/s/170-1705038_orange-text-file-4-icon-document-icon-png.png" width="15px"> A1

          `name: "A1"`

          `setup: "desktop"`

          <img src="https://listimg.pinclipart.com/picdir/s/170-1705038_orange-text-file-4-icon-document-icon-png.png" width="15px"> A2
  
          `....`

      <img src="https://listimg.pinclipart.com/picdir/s/170-1705038_orange-text-file-4-icon-document-icon-png.png" width="15px"> room2
  
      `....`

  <img src="https://listimg.pinclipart.com/picdir/s/170-1705038_orange-text-file-4-icon-document-icon-png.png" width="14px"> quito

  `....`

  <img src="https://listimg.pinclipart.com/picdir/s/170-1705038_orange-text-file-4-icon-document-icon-png.png" width="14px"> loja

  `....`


### Firestone database: users

The main collection is called "users," which contains documents named after the email addresses of the users who registered. Each user stores their personal relevant information as data.

<img src="https://cdn.onlinewebfonts.com/svg/img_3438.png" width="17px"> users

  <img src="https://listimg.pinclipart.com/picdir/s/170-1705038_orange-text-file-4-icon-document-icon-png.png" width="14px"> mail@mail.com
  
  `displayName: "name"`

  `location: "city"`

  `workEmail: "mail@mail.com"`

  <img src="https://listimg.pinclipart.com/picdir/s/170-1705038_orange-text-file-4-icon-document-icon-png.png" width="14px"> mail2@mail2.com

  `....`
