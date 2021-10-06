@Test
    public void testEquals() {

        CyclicNumberAxis a1 = new CyclicNumberAxis(10, 0, "Test");
        CyclicNumberAxis a2 = new CyclicNumberAxis(10, 0, "Test");
        assertTrue(a1.equals(a2));

        // period
        a1.setPeriod(5);
        assertFalse(a1.equals(a2));
        a2.setPeriod(5);
        assertTrue(a1.equals(a2));

        // offset
        a1.setOffset(2.0);
        assertFalse(a1.equals(a2));
        a2.setOffset(2.0);
        assertTrue(a1.equals(a2));

        // advance line Paint
        a1.setAdvanceLinePaint(new GradientPaint(1.0f, 2.0f, Color.RED,
                3.0f, 4.0f, Color.BLACK));
        assertFalse(a1.equals(a2));
        a2.setAdvanceLinePaint(new GradientPaint(1.0f, 2.0f, Color.RED,
                3.0f, 4.0f, Color.BLACK));
        assertTrue(a1.equals(a2));

        // advance line Stroke
        Stroke stroke = new BasicStroke(0.2f);
        a1.setAdvanceLineStroke(stroke);
        assertFalse(a1.equals(a2));
        a2.setAdvanceLineStroke(stroke);
        assertTrue(a1.equals(a2));

        // advance line Visible
        a1.setAdvanceLineVisible(!a1.isAdvanceLineVisible());
        assertFalse(a1.equals(a2));
        a2.setAdvanceLineVisible(a1.isAdvanceLineVisible());
        assertTrue(a1.equals(a2));

        // cycle bound mapping
        a1.setBoundMappedToLastCycle(!a1.isBoundMappedToLastCycle());
        assertFalse(a1.equals(a2));
        a2.setBoundMappedToLastCycle(a1.isBoundMappedToLastCycle());
        assertTrue(a1.equals(a2));

    }

    