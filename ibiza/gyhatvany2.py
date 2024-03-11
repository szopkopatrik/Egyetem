


def gyorsHatvany(alap, exp, mod):
    x = 1
    while exp > 0:
        if exp % 2 == 1:
            x = (x * alap) % mod
        alap = (alap * alap) % mod
        exp //= 2
    return x

print(gyorsHatvany(129,97,171))
