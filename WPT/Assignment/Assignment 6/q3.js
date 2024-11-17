
const cricketBooks = [
    {
        title: "Playing It My Way",
        author: "Sachin Tendulkar",
        yearPublished: 2014,
        displayDetails() {
            console.log(`Title: ${this.title}, Author: ${this.author}, Year: ${this.yearPublished}`);
        }
    },
    {
        title: "No Spin",
        author: "Shane Warne",
        yearPublished: 2018,
        displayDetails() {
            console.log(`Title: ${this.title}, Author: ${this.author}, Year: ${this.yearPublished}`);
        }
    },
    {
        title: "The Test of My Life: From Cricket to Cancer and Back",
        author: "Yuvraj Singh",
        yearPublished: 2013,
        displayDetails() {
            console.log(`Title: ${this.title}, Author: ${this.author}, Year: ${this.yearPublished}`);
        }
    },
    {
        title: "Beyond A Boundary",
        author: "C.L.R. James",
        yearPublished: 1963,
        displayDetails() {
            console.log(`Title: ${this.title}, Author: ${this.author}, Year: ${this.yearPublished}`);
        }
    },
    {
        title: "AB: The Autobiography",
        author: "AB de Villiers",
        yearPublished: 2016,
        displayDetails() {
            console.log(`Title: ${this.title}, Author: ${this.author}, Year: ${this.yearPublished}`);
        }
    },
    {
        title: "Out of the Box: Watching the Game We Love",
        author: "Harsha Bhogle",
        yearPublished: 2010,
        displayDetails() {
            console.log(`Title: ${this.title}, Author: ${this.author}, Year: ${this.yearPublished}`);
        }
    },
    {
        title: "A Century Is Not Enough: My Roller-coaster Ride to Success",
        author: "Sourav Ganguly",
        yearPublished: 2018,
        displayDetails() {
            console.log(`Title: ${this.title}, Author: ${this.author}, Year: ${this.yearPublished}`);
        }
    },
    {
        title: "The Barefoot Coach: Life-Changing Insights from Coaching the World's Best Cricketers",
        author: "Paddy Upton",
        yearPublished: 2019,
        
        displayDetails() {
            console.log(`Title: ${this.title}, Author: ${this.author}, Year: ${this.yearPublished}`);
        }
    }
];

cricketBooks.forEach(book => book.displayDetails());
