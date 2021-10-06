@Test
    public void testEquals() {
        SymbolAxis a1 = new SymbolAxis("Axis", new String[] {"A", "B"});
        SymbolAxis a2 = new SymbolAxis("Axis", new String[] {"A", "B"});
        assertTrue(a1.equals(a2));
        assertTrue(a2.equals(a1));

        a1 = new SymbolAxis("Axis 2", new String[] {"A", "B"});
        assertFalse(a1.equals(a2));
        a2 = new SymbolAxis("Axis 2", new String[] {"A", "B"});
        assertTrue(a1.equals(a2));

        a1 = new SymbolAxis("Axis 2", new String[] {"C", "B"});
        assertFalse(a1.equals(a2));
        a2 = new SymbolAxis("Axis 2", new String[] {"C", "B"});
        assertTrue(a1.equals(a2));

        a1.setGridBandsVisible(false);
        assertFalse(a1.equals(a2));
        a2.setGridBandsVisible(false);
        assertTrue(a1.equals(a2));

        a1.setGridBandPaint(Color.BLACK);
        assertFalse(a1.equals(a2));
        a2.setGridBandPaint(Color.BLACK);
        assertTrue(a1.equals(a2));

        a1.setGridBandAlternatePaint(Color.RED);
        assertFalse(a1.equals(a2));
        a2.setGridBandAlternatePaint(Color.RED);
        assertTrue(a1.equals(a2));
    }

}