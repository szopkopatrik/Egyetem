public enum Level {
    High(3),
    Medium(2),
    Low(1);

    private int lvlNum;

    private Level(int num) {
        this.lvlNum = num;
    }

    public int getLvl() {
        return this.lvlNum;
    }

    public void setLvl(int num) {
        this.lvlNum = num;
    }
}
