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