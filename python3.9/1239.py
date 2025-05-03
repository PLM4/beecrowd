while True:
  try:
    txt = input()

    aberturaI = True
    aberturab = True
    txtsaida = ""
    for letra in txt:
      if letra == "_":
        if aberturaI:
          txtsaida += "<i>"
        else:
          txtsaida += "</i>"  
          
        aberturaI = not aberturaI
        
      elif letra == "*":
        if aberturab:
          txtsaida += "<b>"
        else:
          txtsaida += "</b>"
          
        aberturab = not aberturab 
      else:
        txtsaida += letra
        
    print(txtsaida)

  except EOFError: 
      break