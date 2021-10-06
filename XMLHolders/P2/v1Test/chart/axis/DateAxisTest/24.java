@Test
    public void testBug3484403() {

        final long[] dates =
            { 1304892000000L, 1304632800000L, 1304546400000L, 1304460000000L,
              1304373600000L, 1304287200000L, 1320015600000L, 1309384800000L,
              1319752800000L, 1319666400000L, 1319580000000L, 1319493600000L };
        Arrays.sort(dates);

        DateAxis axis = new DateAxis("Date");
        // set start and end date
        Date start = new Date(dates[0]);
        Date end = new Date(dates[dates.length-1]);
        axis.setMinimumDate(start);
        axis.setMaximumDate(end);

        BufferedImage image = new BufferedImage(200, 100,
                BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0.0, 0.0, 500, 200);

        // if the bug is still present, this leads to an endless loop
        axis.refreshTicks(g2, new AxisState(), area, RectangleEdge.BOTTOM);
    }
    
    