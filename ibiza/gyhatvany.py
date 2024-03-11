


def gyorsHatvany(alap,exp,mod):
    alap = alap%mod
    if(exp == 0):
        return 0
    elif(exp == 1):
        return alap
    elif(exp%2 == 0):
        return gyorsHatvany(alap*alap%mod,exp/2, mod)
    else:
        return alap ^ gyorsHatvany(alap,exp-1,mod)%mod
    

print(gyorsHatvany(129,97,171))

    