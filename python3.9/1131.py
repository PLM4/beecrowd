Inter, Gremio = input().split()
Inter = int(Inter)
Gremio = int(Gremio)
contIn = 0
contGre = 0
empate = 0
grenais = 0

if Inter > Gremio:
  contIn += 1
  grenais += 1
elif Gremio > Inter:
  contGre += 1
  grenais += 1
elif Gremio == Inter:
  empate += 1
  grenais += 1

while Inter >= 0 and Gremio >= 0:
  Grenal = int(input("Novo grenal (1-sim 2-nao)"))
  print()
  if Grenal == 1:
    Inter, Gremio = input().split()
    Inter = int(Inter)
    Gremio = int(Gremio)

    if Inter > Gremio:
      contIn += 1
      grenais += 1
    elif Gremio > Inter:
      contGre += 1
      grenais += 1
    elif Gremio == Inter:
      empate += 1
      grenais += 1
  elif Grenal == 2:
    print(f"{grenais} grenais")
    print(f"Inter:{contIn}")
    print(f"Gremio:{contGre}")
    print(f"Empates:{empate}")

    if contIn > contGre:
      print("Inter venceu mais")
    elif contGre > contIn:
      print("Gremio venceu mais")

    break