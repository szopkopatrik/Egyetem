


def gyorsHatvany(alap,exp,mod):
    alap = alap%mod
    if(exp == 0):
        return 0
    elif(exp == 1):
        return alap
    elif(exp%2 == 0):
        return print(f"{alap * alap % mod, exp / 2, mod}")
    else:
        return print(f"{alap * alap, exp - 1, mod % mod}")
    
#Teszt
gyorsHatvany(129,97,171)

    