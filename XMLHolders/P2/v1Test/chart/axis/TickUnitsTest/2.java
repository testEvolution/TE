@Test
    public void testEquals() {
        TickUnits t1 = new TickUnits();
        t1.add(new NumberTickUnit(10, new DecimalFormat("0.00")));
        TickUnits t2 = new TickUnits();
        t2.add(new NumberTickUnit(10, new DecimalFormat("0.00")));
        assertTrue(t1.equals(t2));
        assertTrue(t2.equals(t1));
    }

}