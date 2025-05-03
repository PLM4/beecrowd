n1, n2 = input().split()
n1 = int(n1)
n2 = int(n2)

if n1 == 1:
  a = 4 * n2
  print("Total: R$ %.2f" % a)
elif n1 == 2:
  a = 4.50 * n2
  print("Total: R$ %.2f" % a)
elif n1 == 3:
  a = 5 * n2
  print("Total: R$ %.2f" % a)
elif n1 == 4:
  a = 2 * n2
  print("Total: R$ %.2f" % a)
elif n1 == 5:
  a = 1.50 * n2
  print("Total: R$ %.2f" % a)
else:
  print("Valor fora da tabela permitida")
