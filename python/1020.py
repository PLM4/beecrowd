# -----Resolução da questão 1020 do beecrowd----- #

i = int(input())

ano = i // 365
i = i % 365
mes = i // 30
i = i % 30
dia = i

print(f"{ano} ano (s)")
print(f"{mes} mes (es)")
print(f"{dia} dia (s)")