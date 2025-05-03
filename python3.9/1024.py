n = int(input())
for caso in range(n):
  text = input()
  novoText = ''
  for caracter in text:
    if caracter.isalpha():
      caracterCode = ord(caracter)
      novoCaracter = chr(caracterCode + 3)
      novoText += novoCaracter
    else:
      novoText += caracter

  invert = ''
  for mudanca in novoText:
    invert = mudanca + invert 

  metade = len(invert)//2
  primMetade = invert[:metade]
  terPassada = invert[metade:]
  novaMetade = ''
  for terCaracter in terPassada:
    terCaracterCode = ord(terCaracter)
    terNovoCaracter = chr(terCaracterCode - 1)
    novaMetade += terNovoCaracter

  resultado = primMetade + novaMetade

  print(resultado)