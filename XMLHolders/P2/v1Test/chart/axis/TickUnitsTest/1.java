@Test
    public void testCloning() throws CloneNotSupportedException {
        TickUnits t1 = new TickUnits();
        t1.add(new NumberTickUnit(10, new DecimalFormat("0.00")));
        TickUnits t2 = (TickUnits) t1.clone();
        assertTrue(t1 != t2);
        assertTrue(t1.getClass() == t2.getClass());
        assertTrue(t1.equals(t2));
    }

    