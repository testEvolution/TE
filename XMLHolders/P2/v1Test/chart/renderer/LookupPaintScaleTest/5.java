@Test
    public void testGeneral() {

        LookupPaintScale s = new LookupPaintScale(0.0, 100.0, Color.BLACK);
        assertEquals(Color.BLACK, s.getPaint(-1.0));
        assertEquals(Color.BLACK, s.getPaint(0.0));
        assertEquals(Color.BLACK, s.getPaint(50.0));
        assertEquals(Color.BLACK, s.getPaint(100.0));
        assertEquals(Color.BLACK, s.getPaint(101.0));

        s.add(50.0, Color.BLUE);
        assertEquals(Color.BLACK, s.getPaint(-1.0));
        assertEquals(Color.BLACK, s.getPaint(0.0));
        assertEquals(Color.BLUE, s.getPaint(50.0));
        assertEquals(Color.BLUE, s.getPaint(100.0));
        assertEquals(Color.BLACK, s.getPaint(101.0));

        s.add(50.0, Color.RED);
        assertEquals(Color.BLACK, s.getPaint(-1.0));
        assertEquals(Color.BLACK, s.getPaint(0.0));
        assertEquals(Color.RED, s.getPaint(50.0));
        assertEquals(Color.RED, s.getPaint(100.0));
        assertEquals(Color.BLACK, s.getPaint(101.0));

        s.add(25.0, Color.GREEN);
        assertEquals(Color.BLACK, s.getPaint(-1.0));
        assertEquals(Color.BLACK, s.getPaint(0.0));
        assertEquals(Color.GREEN, s.getPaint(25.0));
        assertEquals(Color.RED, s.getPaint(50.0));
        assertEquals(Color.RED, s.getPaint(100.0));
        assertEquals(Color.BLACK, s.getPaint(101.0));

        s.add(75.0, Color.YELLOW);
        assertEquals(Color.BLACK, s.getPaint(-1.0));
        assertEquals(Color.BLACK, s.getPaint(0.0));
        assertEquals(Color.GREEN, s.getPaint(25.0));
        assertEquals(Color.RED, s.getPaint(50.0));
        assertEquals(Color.YELLOW, s.getPaint(75.0));
        assertEquals(Color.YELLOW, s.getPaint(100.0));
        assertEquals(Color.BLACK, s.getPaint(101.0));
    }

}