@Test
    public void testConstructorArgumentChecks() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Week(0, 2020);
        });
        assertTrue(exception.getMessage().contains("week"));
        Exception exception2 = assertThrows(IllegalArgumentException.class, () -> {
             new Week(54, 2020);
        });
        assertTrue(exception2.getMessage().contains("week"));
        Exception exception3 = assertThrows(IllegalArgumentException.class, () -> {
            new Week(0, new Year(2020));
        });
        assertTrue(exception3.getMessage().contains("week"));
        Exception exception4 = assertThrows(IllegalArgumentException.class, () -> {
             new Week(54, new Year(2020));
        });
        assertTrue(exception2.getMessage().contains("week"));
    }
    
    