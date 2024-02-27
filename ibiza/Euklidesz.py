


def kibovitettEuklidesz(a, b):
    x0, x1, y0, y1, s = 1, 0, 0, 1, 1
    while b != 0:
        r = a % b
        q = a // b
        a, b = b, r
        x = x1
        y = y1
        x1 = q * x1 + x0
        y1 = q * y1 + y0
        x0 = x
        y0 = y
        s = -s
    x = s * x0
    y = -s * y0
    d,x,y = a,x,y
    return d, x, y

#Teszt
a = 329
b = 15
d, x, y = kibovitettEuklidesz(a, b)
print(f"A legnagyobb közös osztó: {d}")
print(f"x lineáris kombinációja: {x}")
print(f"y lineáris kombinációja: {y}")