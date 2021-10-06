@Test
    public void testCloning() throws CloneNotSupportedException {
        AxisSpace s1 = new AxisSpace();
        AxisSpace s2 = (AxisSpace) s1.clone();
        assertTrue(s1 != s2);
        assertTrue(s1.getClass() == s2.getClass());
        assertTrue(s1.equals(s2));
    }

}