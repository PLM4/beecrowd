n1, n2, n3, n4 = input().split()
n1 = float(n1)
n2 = float(n2)
n3 = float(n3)
n4 = float(n4)


media = (n1*2 + n2*3 + n3*4 + n4)/10


if media >= 7.0:
  print("Media: %.1f" % media)
  print('Aluno aprovado.')
elif media <= 4.9:
  print("Media: %.1f" % media)
  print("Aluno reprovado.")
elif media >= 5.0 and media <= 6.9:
  print("Media: %.1f" % media)
  print("Aluno em exame.")
  n5 = float(input())
  print('Nota do exame:' , n5)
  media = (media + n5)/2
  if media >= 5.0:
    print("Aluno aprovado.")
    print('Media final: %.1f' % media)
  elif media <= 4.9:
    print("Aluno reprovado.")
    print("Media final: %.1f" % media)
    
    
  