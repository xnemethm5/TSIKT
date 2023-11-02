class RocneObdobia {

    public enum RocneObdobie {
        Spring, Summer, Autumn, Winter;
    }

    public static RocneObdobia.RocneObdobie zistiRocneObdobie(int mesiac) {

        if (mesiac == 1 || mesiac == 2 || mesiac == 12) {
            return RocneObdobie.Winter;
        }
        if (mesiac == 3 || mesiac == 4 || mesiac == 5) {
            return RocneObdobie.Spring;
        }
        if (mesiac == 6 || mesiac == 7 || mesiac == 8) {
            return RocneObdobie.Summer;
        }
        if (mesiac == 9 || mesiac == 10 || mesiac == 11) {
            return RocneObdobie.Autumn;
        }
        return null;
    }

}