@Test
    public void testSerialization() {
        ShipNeedle n1 = new ShipNeedle();
        ShipNeedle n2 = (ShipNeedle) TestUtils.serialised(n1);
        assertTrue(n1.equals(n2));
    }

}