/**
 * @param {Promise} promise1
 * @param {Promise} promise2
 * @return {Promise}
 */
var addTwoPromises = async function(promise1, promise2) {
    const val1= await promise1; //serial
    const val2= await promise2;

    // const[val1,val2]=await Promise.all([promise1,promise2]); //parallel

    return val1+val2;

    // return (await Promise.all([promise1,promise2])).reduce((acc,curr)=> acc+curr);
};

/**
 * addTwoPromises(Promise.resolve(2), Promise.resolve(2))
 *   .then(console.log); // 4
 */