n = float(input())

if n < 0 and n > 100:
  print ("Fora de intervalo")
elif n >= 0 and n <= 25:
  print("Intervalo [0,25]")
elif n >= 25.01 and n <= 50:
  print("Intervalo (25,50]")
elif n >= 50.01 and n <= 75:
  print("Intervalo (50,75]")
elif n >= 75.01 and n <= 100:
  print("Intervalo (75,100]")