let total = 0;
let pesanText = "Halo, saya mau pesan:%0A";

function tambah(nama, harga) {
  total += harga;
  document.getElementById("total").innerText = total;

  let li = document.createElement("li");
  li.innerText = nama + " - Rp " + harga;
  document.getElementById("list").appendChild(li);

  pesanText += "- " + nama + " Rp " + harga + "%0A";
}

function pesan() {
  pesanText += "Total: Rp " + total;
  window.open("https://wa.me/6281234567890?text=" + pesanText);
}