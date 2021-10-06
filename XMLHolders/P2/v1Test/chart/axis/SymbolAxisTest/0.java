@Test
    public void testSerialization() {
        String[] tickLabels = new String[] {"One", "Two", "Three"};
        SymbolAxis a1 = new SymbolAxis("Test Axis", tickLabels);
        SymbolAxis a2 = (SymbolAxis) TestUtils.serialised(a1);
        assertEquals(a1, a2);
    }

    