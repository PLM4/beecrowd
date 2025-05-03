i, i1, f, f1 = input().split()
i = int(i)
i1 = int(i1)
f = int(f)
f1 = int(f1)

H = f - i
M = f1 - i1

if M < 0:
  H = H - 1
  M = 60 + (M)
if H < 0:
  H = H + 24
elif H == 0 and M == 0:
  H = 24

print(f"O JOGO DUROU {H} HORA(S) E {M} MINUTO(S)")