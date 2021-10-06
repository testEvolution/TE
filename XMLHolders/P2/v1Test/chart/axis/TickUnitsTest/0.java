@Test
    public void testSerialization() {
        TickUnits t1 = new TickUnits();
        t1.add(new NumberTickUnit(10, new DecimalFormat("0.00")));
        TickUnits t2 = (TickUnits) TestUtils.serialised(t1);
        assertEquals(t1, t2);
    }

    