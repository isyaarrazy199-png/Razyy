# Input dari pengguna
panjang = float(input("Masukkan panjang balok: "))
lebar = float(input("Masukkan lebar balok: "))
tinggi = float(input("Masukkan tinggi balok: "))

# Perhitungan
volume = panjang * lebar * tinggi
luas_permukaan = 2 * (panjang*lebar + panjang*tinggi + lebar*tinggi)

# Output
print("Volume balok =", volume)
print("Luas permukaan balok =", luas_permukaan)