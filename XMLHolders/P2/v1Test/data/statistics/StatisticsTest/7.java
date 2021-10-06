@Test
    public void testCalculateMedian5() {
        List<Double> values = new ArrayList<>();
        values.add(11.228692993861783);
        values.add(11.30823353859889);
        values.add(11.75312904769314);
        values.add(11.825102897465314);
        values.add(10.184252778401783);
        values.add(12.207951828057766);
        values.add(10.68841994040566);
        values.add(12.099522004479438);
        values.add(11.508874945056881);
        values.add(12.052517729558513);
        values.add(12.401481645578734);
        values.add(12.185377793028543);
        values.add(10.666372951930315);
        values.add(11.680978041499548);
        values.add(11.06528277406718);
        values.add(11.36876492904596);
        values.add(11.927565516175939);
        values.add(11.39307785978655);
        values.add(11.989603679523857);
        values.add(12.009834360354864);
        values.add(10.653351822461559);
        values.add(11.851776254376754);
        values.add(11.045441544755946);
        values.add(11.993674040560624);
        values.add(12.898219965238944);
        values.add(11.97095782819647);
        values.add(11.73234406745488);
        values.add(11.649006017243991);
        values.add(12.20549704915365);
        values.add(11.799723639384919);
        values.add(11.896208658005628);
        values.add(12.164149111823424);
        values.add(12.042795103513766);
        values.add(12.114839532596426);
        values.add(12.166609097075824);
        values.add(12.183017546225935);
        values.add(11.622009125845342);
        values.add(11.289365786738633);
        values.add(12.462984323671568);
        values.add(11.573494921030598);
        values.add(10.862867940485804);
        values.add(12.018186939664872);
        values.add(10.418046849313018);
        values.add(11.326344465881341);
        double median = Statistics.calculateMedian(values, true);
        assertEquals(11.812413268425116, median, 0.000001);
        Collections.sort(values);
        double median2 = Statistics.calculateMedian(values, false);
        assertEquals(11.812413268425116, median2, 0.000001);
    }

    