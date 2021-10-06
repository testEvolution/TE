@Test
    public void testBug2201869() {
        TimeZone tz = TimeZone.getTimeZone("GMT");
        GregorianCalendar c = new GregorianCalendar(tz, Locale.UK);
        DateAxis axis = new DateAxis("Date", tz, Locale.UK);
        SimpleDateFormat sdf = new SimpleDateFormat("d-MMM-yyyy", Locale.UK);
        sdf.setCalendar(c);
        axis.setTickUnit(new DateTickUnit(DateTickUnitType.MONTH, 1, sdf));
        Day d1 = new Day(1, 3, 2008);
        d1.peg(c);
        Day d2 = new Day(30, 6, 2008);
        d2.peg(c);
        axis.setRange(d1.getStart(), d2.getEnd());
        BufferedImage image = new BufferedImage(200, 100,
                BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0.0, 0.0, 200, 100);
        axis.setTickMarkPosition(DateTickMarkPosition.END);
        List ticks = axis.refreshTicks(g2, new AxisState(), area,
                RectangleEdge.BOTTOM);
        assertEquals(3, ticks.size());
        DateTick t1 = (DateTick) ticks.get(0);
        assertEquals("31-Mar-2008", t1.getText());
        DateTick t2 = (DateTick) ticks.get(1);
        assertEquals("30-Apr-2008", t2.getText());
        DateTick t3 = (DateTick) ticks.get(2);
        assertEquals("31-May-2008", t3.getText());

        // now repeat for a vertical axis
        ticks = axis.refreshTicks(g2, new AxisState(), area,
                RectangleEdge.LEFT);
        assertEquals(3, ticks.size());
        t1 = (DateTick) ticks.get(0);
        assertEquals("31-Mar-2008", t1.getText());
        t2 = (DateTick) ticks.get(1);
        assertEquals("30-Apr-2008", t2.getText());
        t3 = (DateTick) ticks.get(2);
        assertEquals("31-May-2008", t3.getText());
    }

    