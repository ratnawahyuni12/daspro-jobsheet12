# daspro-jobsheet12

Pertanyaan Percobaan 1
1. Apakah fungsi tanpa parameter selalu harus bertipe void?
Jawab : tidak. fungsi tanpa parameter tidak harus bertipe void. yang wajib hanyalah bahwa fungsi tanpa parameter tidak menerima input, namun tetap boleh mengembalikan nilai dengan tipe data apa pun seperti int, String, double, array, dan sebagainya. sebuah fungsi tanpa parameter biasanya menggunakan void hanya pada saat menjalankan proses tanpa perlu mengembalikan nilai.
2. Apakah daftar menu pada program kafe dapat ditampilkan tanpa menggunakan fungsi Menu()? Modifikasi kode program tersebut untuk dapat menampilkan daftar menu tanpa menggunakan fungsi!
Jawab : iya, daftar menu pada program kafe dapat ditampilkan tanpa menggunakan fungsi Menu(). hal ini dapat dilakukan dengan cara menuliskan perintah System.out.println() di dalam fungsi main().
3. Jelaskan keuntungan menggunakan fungsi Menu() dibandingkan menulis semua perintah penampilan menu langsung di dalam fungsi main.
Jawab : Menggunakan fungsi Menu() membuat program lebih rapi, mudah dirawat, dan lebih efisien. Menu dapat ditampilkan berulang kali tanpa menulis ulang kode. Perubahan menu juga cukup dilakukan di satu tempat saja. Selain itu, fungsi Menu() membuat kode lebih mudah dibaca dan dikembangkan dibanding menulis semua perintah langsung di dalam main().
4. Uraikan secara singkat alur eksekusi program ketika fungsi Menu() dipanggil dari main (mulai dari program dijalankan sampai daftar menu tampil di layar).
Jawab : Ketika program dijalankan, eksekusi dimulai dari fungsi main(). di dalam main() perintah Menu() dipanggil. program kemudian berpindah ke fungsi Menu(), menjalankan seluruh perintah System.out.println() di dalamnya, dan menampilkan daftar menu ke layar. Setelah selesai, eksekusi kembali ke main() dan program berlanjut atau berakhir sesuai kode berikutnya.

Pertanyaan Percobaan 2
1. Apakah kegunaan parameter di dalam fungsi?
Jawab : parameter dalam fungsi digunakan untuk menerima data atau nilai dari luar fungsi sehingga fungsi dapat bekerja secara fleksibel. dengan parameter, fungsi bisa menampilkan hasil atau melakukan proses yang berbeda tergantung nilai yang diterimanya. misalnya, parameter namaPelanggan dan isMember pada program di percobaan 2 digunakan untuk menyesuaikan tampilan menu sesuai nama pelanggan dan status membernya.
2. Jelaskan mengapa pada percobaan ini fungsi Menu() menggunakan parameter namaPelanggan dan isMember?
Jawab : fungsi Menu() menggunakan parameter namaPelanggan dan isMember karena fungsi tersebut perlu menyesuaikan tampilan menu berdasarkan data pelanggan.
- namaPelanggan : digunakan agar program dapat menampilkan sapaan khusus, sehingga menu terlihat lebih personal.
- isMember : digunakan untuk cek apakah pelanggan adalah member, sehingga program bisa menampilkan informasi diskon 10% hanya bagi pelanggan yang berstatus member.
3. Apakah parameter sama dengan variabel? Jelaskan.
Jawab : parameter bukan variabel yang sama persis, namun mirip karena sama-sama digunakan untuk menyimpan nilai.
- parameter adalah variabel khusus yang didefinisikan dalam deklarasi fungsi dan digunakan untuk menerima nilai dari luar fungsi.
- variabel adalah penyimpanan data yang dibuat di dalam fungsi atau kelas untuk keperluan proses dalam program.
kesimpulannya, parameter adalah variabel yang digunakan untuk menerima input saat fungsi dipanggil.
4. Jelaskan bagaimana cara kerja parameter isMember pada fungsi Menu(). Apa perbedaan output ketika isMember bernilai true dan ketika false?
Jawab : parameter isMember berfungsi sebagai penentu apakah pelanggan adalah member atau bukan. saat fungsi Menu() dipanggil, nilai true atau false dikirim ke parameter tersebut.
- jika isMember bernilai true, maka pesan tentang diskon member akan ditampilkan.
- jika isMember bernilai false, kondisi if tidak terpenuhi sehingga pesan diskon tidak muncul.
jadi, perbedaannya terletak pada muncul atau tidaknya informasi diskon 10% pada output.
5. Apa yang akan terjadi jika memanggil fungsi Menu() tanpa menyertakan parameter namaPelanggan dan isMember?
Jawab : jika memanggil fungsi Menu() tanpa menyertakan parameter namaPelanggan dan isMember, maka akan terjadi error (compile-time error). karena fungsi wajib menerima 2 parameter. yaitu : 
- String : nama pelanggan.
- boolean : status member.
apabila java tidak menemukan fungsi Menu() yang cocok dengan panggilan tersebut, maka akan terjadi error.
6. Modifikasi kode di atas dengan menambahkan parameter baru kodePromo (String). Jika kodePromo adalah "DISKON50", tampilkan berikan diskon 50%. Jika kodePromo adalah "DISKON30", tampilkan berikan diskon 30%. Jika tidak ada kode promo yang berlaku, tampilkan kode invalid.
7. Berdasarkan fungsi Menu() di atas, jika nama pelanggan adalah "Budi", pelanggan tersebut member, dan menggunakan kode promo "DISKON30", tuliskan satu baris perintah pemanggilan fungsi menu yang benar.
Jawab : berikut baris perintah pemanggilan fungsi menu yang benar berdasarkan data di soal :
Menu("Budi", true, "DISKON30");
8. Menurut Anda, apakah penggunaan parameter namaPelanggan dan isMember pada fungsi Menu() membuat program lebih mudah dibaca dan dikembangkan dibandingkan jika nilai-nilai tersebut ditulis langsung di dalam fungsi tanpa parameter? Jelaskan alasan Anda.
jawab : Iya, penggunaan parameter namaPelanggan dan isMember membuat program lebih mudah dibaca dan dikembangkan. dengan parameter, fungsi Menu() menjadi fleksibel karena dapat menampilkan menu untuk pelanggan mana pun tanpa harus mengubah isi fungsi. jika nilai seperti nama pelanggan atau status member ditulis langsung di dalam fungsi, maka fungsi hanya cocok untuk satu orang saja dan sulit digunakan kembali. selain itu, setiap kali ingin menampilkan menu untuk pelanggan berbeda, programmer harus mengedit kode secara manual. 
dengan parameter, fungsi lebih rapi, mudah dipahami, dan lebih mudah diperluas untuk kebutuhan lain di masa depan.

Pertanyaan Percobaan 3
1. Jelaskan secara singkat kapan suatu fungsi membutuhkan nilai kembalian (return value) dan kapan fungsi tidak perlu mengembalikan nilai. Berikan minimal satu contoh dari program kafe pada Percobaan 3 untuk masing-masing kasus.
Jawab : suatu fungsi membutuhkan nilai kembalian (return value) apabila fungsi tersebut menghasilkan sebuah nilai yang akan digunakan kembali oleh program. contohnya pada program kafe :
- fungsi hitungTotalHarga21() memiliki return value karena harus mengembalikan total harga untuk dipakai dan ditampilkan di main().
sedangkan fungsi tidak perlu memiliki return value apabila fungsinya hanya menjalankan proses tanpa harus menghasilkan nilai. contohnya pada program kafe :
- fungsi Menu() tidak mengembalikan nilai karena hanya menampilkan daftar menu dan informasi promo, tidak menghasilkan angka atau data yang dibutuhkan kembali oleh program.
2. Fungsi hitungTotalHargaNoAbsen saat ini mengembalikan total harga berdasarkan pilihanMenu dan jumlahPesanan. Sebutkan tipe data nilai kembalian dan dua buah parameter yang digunakan fungsi tersebut. Jelaskan arti masing-masing parameter dalam konteks program kafe.
Jawab : tipe data nilai kembalian yang digunakan adalah int, karena fungsi hitungTotalHargaNoAbsen menghasilkan total harga dalam bentuk angka bulat (integer). dua buah parameter yang digunakan fungsi tersebut :
(1.) int pilihanMenu :
   - menyimpan nomor menu yang dipilih pelanggan (1 sampai 6).
   - digunakan untuk mencari harga sesuai menu dalam array harga.
(2.) int jumlahPesanan :
   - menyimpan berapa banyak porsi atau item yang dipesan pelanggan.
   - digunakan untuk menghitung total harga = harga * jumlah pesanan.
jadi, fungsi menggunakan parameter tersebut agar dapat menghitung total harga sesuai menu dan jumlah pesanan pelanggan secara tepat.
3. Modifikasi kode di atas sehingga fungsi hitungTotalHargaNoAbsen dapat menerima kodePromo. Jika kodePromo adalah "DISKON50", maka mendapat diskon 50% dari totalHarga dan tampilkan diskon. Jika kodePromo adalah "DISKON30", maka mendapat diskon 30% dari totalHarga dan tampilkan diskon. Jika tidak ada kode 
promo yang berlaku, tampilkan kode invalid dan tidak ada pengurangan total harga totalHarga.
4. Modifikasi kode di atas sehingga bisa memilih beberapa jenis menu berbeda serta menampilkan total keseluruhan pesanan. Bagaimana memodifikasi program sehingga pengguna dapat: memesan lebih dari satu jenis menu (misalnya menu 1 dan 3 sekaligus), dan menampilkan total keseluruhan pesanan (gabungan dari semua jenis menu)?

Pertanyaan Percobaan 4
1. Jelaskan mengapa penulisan parameter di praktikum 4 ditulis dengan String... namaPengunjung!
Jawab : penulisan parameter String... namaPengunjung digunakan karena pada percobaan 4 fungsi daftarPengunjung() harus bisa menerima jumlah argumen yang tidak tentu, bisa satu nama, dua nama, atau banyak nama sekaligus. String... adalah varargs (variabel argument), yaitu cara di Java untuk membuat parameter yang dapat menerima 0 atau lebih nilai tanpa perlu membuat array secara manual. jadi, penulisan String... namaPengunjung dipakai agar fungsi lebih fleksibel dan dapat menerima banyak nama pengunjung sekaligus tanpa harus menentukan jumlahnya.
2. Modifikasi method daftarPengunjung menggunakan for-each loop.
3. Bisakah menggunakan dua tipe data varaargs dalam satu fungsi? Jelaskan jawaban Anda berdasarkan aturan varargs di Java, dan berikan contohnya!
Jawab : tidak. java tidak mengizinkan dua varargs dalam satu fungsi, karena dapat menyebabkan error. hanya boleh ada satu varargs, dan harus berada di parameter paling akhir.
4. Jelaskan apa yang terjadi jika fungsi daftarPengunjung dipanggil tanpa argumen. Apakah program akan error saat kompilasi, error saat dijalankan, atau tetap berjalan? Jika tetap berjalan, bagaimana output yang dihasilkan?
Jawab : pemanggilan fungsi daftarPengunjung() tanpa argumen tetap boleh dilakukan dan tidak akan menyebabkan error, baik saat kompilasi maupun saat program dijalankan. hal ini terjadi karena parameter String... namaPengunjung adalah varargs, yang berarti jumlah argumennya boleh 0, 1, atau lebih. jika tidak ada argumen yang diberikan, maka namaPengunjung akan menjadi array kosong dengan panjang 0. 
output yang dihasilkan :

Daftar Nama Pengunjung:

(tidak ada daftar nama karena array kosong).

Pertanyaan Percobaan 5
1.   Sebutkan tahapan dan urutan eksekusi program pada Percobaan 5, mulai dari program dijalankan hingga menampilkan luas persegi panjang dan volume balok!
Jawab : tahapan dan urutan eksekusi program pada Percobaan 5 :
(1.) program dijalankan : eksekusi dimulai dari fungsi main() karena itu adalah titik awal program Java. 
(2.) Scanner dibuat untuk menerima input : dengan adanya Scanner input = new Scanner(System.in), program siap membaca nilai panjang, lebar, dan tinggi dari pengguna.
(3.) program meminta input panjang : dengan adanya 
System.out.println("Masukkan panjang");
p = input.nextInt();
pengguna memasukkan nilai panjang yang disimpan ke variabel p.
(4.) program meminta input lebar : dengan adanya 
System.out.println("Masukkan lebar");
l = input.nextInt();
pengguna memasukkan nilai lebar yang disimpan ke variabel l.
(5.) program meminta input tinggi : dengan adanya 
System.out.println("Masukkan tinggi");
t = input.nextInt();
pengguna memasukkan nilai tinggi yang disimpan ke variabel t.
(6.) program memanggil fungsi hitungLuas : menggunakan 
L = hitungLuas(p, l); 
di dalam hitungLuas :
- parameter pjg menerima nilai p.
- parameter lb menerima nilai l.
- dihitung: Luas = p * l.
- nilai luas dikembalikan ke main.
(7.) program menampilkan luas persegi panjang : menggunakan System.out.println("Luas persegi panjang adalah " + L);
(8.) program memanggil fungsi hitungVolume : menggunakan vol = hitungVolume(t, p, l);
di dalam hitungVolume :
- parameter tinggi menerima nilai t.
- parameter a menerima p, dan b menerima l.
- hitungVolume() memanggil hitungLuas(a, b) lagi untuk menghitung alas: luas alas = p * l.
- volume dihitung: menggunakan volume = luasAlas * tinggi.
- nilai volume dikembalikan ke main.
(9.) program menampilkan volume balok : menggunakan System.out.println("Volume balok adalah " + vol);
(10.) Scanner ditutup menggunakan input.close(); dan program selesai.
2. Tuliskan output yang dihasilkan program HitungBalokNoAbsen jika pengguna memasukkan panjang = 4, lebar = 3, dan tinggi = 5. Jelaskan secara singkat alur jalannya program sampai output tersebut muncul.
Jawab : output yang dihasilkan program HitungBalokNoAbsen jika pengguna memasukkan input sesuai dengan soal adalah :
Masukkan panjang
4
Masukkan lebar
3
Masukkan tinggi
5
Luas persegi panjang adalah 12
Volume balok adalah 60
alur jalannya program :
(1.) program dijalankan, eksekusi dimulai dari fungsi main().
(2.) program menampilkan Masukkan panjang, pengguna memasukkan 4 yang disimpan ke variabel p.
(3.) program menampilkan Masukkan lebar, pengguna memasukkan 3 yang disimpan ke variabel l.
(4.) program menampilkan Masukkan tinggi, pengguna memasukkan 5 yang disimpan ke variabel t.
(5.) program memanggil L = hitungLuas(p, l);
di fungsi hitungLuas(4,3) :
- luas = 4 * 3 = 12.
- nilai 12 dikembalikan ke main.
(6.) program menampilkan Luas persegi panjang adalah 12
(7.) program memanggil vol = hitungVolume(t, p, l);
di fungsi hitungVolume(5, 4, 3) :
- fungsi ini memanggil hitungLuas(4, 3) yang menghasilkan 12.
- volume = luas * tinggi = 12 * 5 = 60.
- nilai 60 dikembalikan ke main.
(8.) program menampilkan Volume balok adalah 60
(9.) program selesai.
