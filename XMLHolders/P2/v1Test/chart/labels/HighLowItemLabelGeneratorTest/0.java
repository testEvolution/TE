@Test
    public void testEquals() {
        HighLowItemLabelGenerator g1 = new HighLowItemLabelGenerator();
        HighLowItemLabelGenerator g2 = new HighLowItemLabelGenerator();
        assertTrue(g1.equals(g2));
        assertTrue(g2.equals(g1));

        g1 = new HighLowItemLabelGenerator(new SimpleDateFormat("d-MMM-yyyy"),
                NumberFormat.getInstance());
        assertFalse(g1.equals(g2));
        g2 = new HighLowItemLabelGenerator(new SimpleDateFormat("d-MMM-yyyy"),
                NumberFormat.getInstance());
        assertTrue(g1.equals(g2));

        g1 = new HighLowItemLabelGenerator(new SimpleDateFormat("d-MMM-yyyy"),
                new DecimalFormat("0.000"));
        assertFalse(g1.equals(g2));
        g2 = new HighLowItemLabelGenerator(new SimpleDateFormat("d-MMM-yyyy"),
                new DecimalFormat("0.000"));
        assertTrue(g1.equals(g2));
    }

    