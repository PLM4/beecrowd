while True:
  try:
    linha = input()
    maiuscula = True
    saida = ""
    for c in linha:
      if c == ' ':
        saida = saida + ' '
      else:
        if maiuscula:
          saida = saida + c.upper()
          maiuscula = False
        else:
          saida = saida + c.lower()
          maiuscula = True
    print(saida)
  except EOFError:
    break