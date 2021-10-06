@BeforeEach
    public void setUp() {
        this.seriesA = new TimeSeries("Series A");
        this.seriesA.add(new Year(2000), 102000);
        this.seriesA.add(new Year(2001), 102001);
        this.seriesA.add(new Year(2002), 102002);
        this.seriesA.add(new Year(2003), 102003);
        this.seriesA.add(new Year(2004), 102004);
        this.seriesA.add(new Year(2005), 102005);

        this.seriesB = new TimeSeries("Series B");
        this.seriesB.add(new Year(2006), 202006);
        this.seriesB.add(new Year(2007), 202007);
        this.seriesB.add(new Year(2008), 202008);

        this.seriesC = new TimeSeries("Series C");
        this.seriesC.add(new Year(1999), 301999);
        this.seriesC.add(new Year(2000), 302000);
        this.seriesC.add(new Year(2002), 302002);
    }

    