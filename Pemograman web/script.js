function handleSubmit(event) {
  event.preventDefault();


  const name = event.target.name.value;
  const message = event.target.message.value;


 
  if (!name || !message) {
    alert("Mohon isi semua field yang diperlukan!");
    return;
  }




  console.log("=== PESAN KONTAK BARU ===");
  console.log("Nama:", name);
  console.log("Pesan:", message);
  console.log("========================");


  alert(
    `Terima kasih ${name}!\n\nPesan Anda telah diterima:\n"${message}"\n\nPesan telah dicatat di console log untuk review lebih lanjut.`
  );


 
  event.target.reset();
}

