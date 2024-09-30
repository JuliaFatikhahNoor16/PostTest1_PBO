# POST-TEST 1 PBO

Nama  : Julia Fatikhah Noor

NIM   : 2309116069

Tema  : Playlist Music K-Pop

## About Project Playlist Music K-Pop
Program ini adalah aplikasi manajemen playlist musik K-pop sederhana yang menggunakan konsep CRUD (Create, Read, Update, Delete), memungkinkan pengguna menambah, menghapus, mengedit, dan menampilkan lagu dalam playlist secara dinamis. Aplikasi memanfaatkan ArrayList untuk menyimpan daftar lagu, sehingga pengguna dapat menambah atau menghapus lagu tanpa batasan jumlah. Fungsionalitas utama terletak pada pengelolaan lagu, seperti menambah, menampilkan, mengedit, dan menghapus lagu berdasarkan input pengguna, serta menampilkan total jumlah lagu dalam playlist. Pengguna berinteraksi melalui menu di terminal, di mana mereka bisa memilih operasi yang diinginkan, kemudian sistem akan meminta detail lagu saat diperlukan, dan memberikan umpan balik setelah operasi selesai. Program ini dirancang untuk pemula yang ingin belajar mengimplementasikan operasi CRUD dalam Java.

## A. Struktur Project
![image](https://github.com/user-attachments/assets/56a52c6e-2586-49cc-9d91-98f2d65a0453)

1. Package: model

-Class: Playlist.java

Deskripsi: Class ini kemungkinan besar bertanggung jawab untuk mengelola daftar lagu (playlist) dalam aplikasi. Kemungkinan terdapat properti berupa daftar (ArrayList) yang berisi objek-objek lagu (dari class Song). Class ini juga akan memiliki metode untuk menambah, menghapus, mengedit, dan menampilkan lagu dalam playlist.

-Class: Song.java

Deskripsi: Class ini digunakan untuk merepresentasikan sebuah lagu. Kemungkinan memiliki beberapa properti seperti judul lagu, artis, durasi, dan tahun rilis. Class ini mungkin juga menyediakan getter dan setter untuk mengakses dan memodifikasi data lagu.

3. Package: playlist

-Class: Main.java

Deskripsi: Class ini merupakan entry point (titik masuk) dari program, di mana logika utama aplikasi dijalankan. Ini adalah tempat di mana objek dari class Playlist dan Song dibuat, serta interaksi dengan pengguna berlangsung. Class ini menyediakan antarmuka berbasis teks (CLI) untuk menambahkan, menghapus, menampilkan, dan mengedit lagu di playlist K-pop.


## B. Fungsionalitas Utama

1. Menambah Lagu: Pengguna dapat menambahkan lagu baru ke dalam playlist dengan memasukkan judul lagu, artis, durasi, dan tahun rilis.
   
![image](https://github.com/user-attachments/assets/6d47083e-b37b-43c6-97e3-7e5135a22ced)

3. Menghapus Lagu: Pengguna dapat menghapus lagu dari playlist berdasarkan judul lagu.
   
![image](https://github.com/user-attachments/assets/c3d85993-12f6-4ab1-b5ed-3cb8c587af26)

5. Menampilkan Playlist: Program menampilkan daftar semua lagu yang ada di playlist.
   
![image](https://github.com/user-attachments/assets/4992f07f-18bb-4815-97c2-087343ef3a81)

7. Mengedit Lagu: Pengguna dapat mengedit informasi lagu yang sudah ada di playlist, seperti judul, artis, durasi, dan tahun rilis.
   
![image](https://github.com/user-attachments/assets/d04ab946-78ba-48cf-ba8e-227bda8fd211)

![image](https://github.com/user-attachments/assets/ae2e84dc-a50a-4705-a7f3-c32a4484d59f)

9. Menampilkan Total Lagu: Program menampilkan total lagu yang ada dalam playlist.
    
![image](https://github.com/user-attachments/assets/19122d9c-dce8-4663-a6b2-805fbdf12115)

11. Menampilkan Menu Keluar
    
![image](https://github.com/user-attachments/assets/a646f812-ace4-42f3-89bb-05925565b1e8)

## C. Output Program
1. Menjalankan aplikasi dengan menjalankan kelas main yang ada dalam package playlist. Kemudian
   terdapat menu playlist dan user diminta untuk menginput pilihan, tampilan seperti berikut:

   ![image](https://github.com/user-attachments/assets/a3e18b42-a541-4188-827a-204fdc3e32df)

3. Menu Tambah lagu
   Masukkan judul lagu, artis, durasi, dan tahun rilis

   ![image](https://github.com/user-attachments/assets/9b9e5aa5-6f80-473b-b621-2a702ebf7769)
   
   Lagu baru telah berhasil ditambahkan
   
   ![image](https://github.com/user-attachments/assets/fb8cd835-7480-4e45-8017-d45d9273709d)

5. Menu Hapus Lagu
   Masukkan judul lagu yang ingin dihapus
   
   ![image](https://github.com/user-attachments/assets/3cc61921-8a9f-487b-bacd-6e24ccbfd750)
   
   Lagu berhasil dihapus dari playlist
   
   ![image](https://github.com/user-attachments/assets/a1eb75d7-c5e4-450f-bdc3-b199c5fdb089)

7. Menu Tampilkan Playlist
   
   ![image](https://github.com/user-attachments/assets/30ec32cb-74b6-418d-a87a-50255393d781)

9. Menu Edit Lagu
    Masukkan judul lagu yang mau diedit

   ![image](https://github.com/user-attachments/assets/dfbff82e-2765-48d4-b571-b649316ca7ed)
   
   Kemudian pilih bagian mana yang ingin diedit
   
   ![image](https://github.com/user-attachments/assets/2160c176-ae7d-4434-8bdd-f744535432bc)
   
   Lagu berhasil diedit
   
   ![image](https://github.com/user-attachments/assets/4aaf1c1f-7a45-4e25-8067-7547b6c183c2)

11. Menu Total Lagu
    
    ![image](https://github.com/user-attachments/assets/34b2c113-05ab-418d-b7fc-db9701bb5215)

13. Keluar
    
    ![image](https://github.com/user-attachments/assets/5d563088-638d-4fa9-9196-fbebede4135a)

