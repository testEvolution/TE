@Test
    public void testCloning() throws CloneNotSupportedException {
        SymbolAxis a1 = new SymbolAxis("Axis", new String[] {"A", "B"});
        SymbolAxis a2 = (SymbolAxis) a1.clone();
        assertTrue(a1 != a2);
        assertTrue(a1.getClass() == a2.getClass());
        assertTrue(a1.equals(a2));
    }

    