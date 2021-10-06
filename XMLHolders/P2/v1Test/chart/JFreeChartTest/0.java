@BeforeEach
    public void setUp() {
        DefaultPieDataset data = new DefaultPieDataset();
        data.setValue("Java", 43.2);
        data.setValue("Visual Basic", 0.0);
        data.setValue("C/C++", 17.5);
        this.pieChart = ChartFactory.createPieChart("Pie Chart", data);
    }

    